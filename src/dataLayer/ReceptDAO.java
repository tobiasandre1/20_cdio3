package dataLayer;

import java.util.List;

import dataLayerInterfaces.DALException;
import dataTransferObject.ReceptDTO;

public class ReceptDAO implements dataLayerInterfaces.IReceptDAO {

	@Override
	public ReceptDTO getRecept(int receptId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReceptDTO> getReceptList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRecept(ReceptDTO recept) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRecept(ReceptDTO recept) throws DALException {
		// TODO Auto-generated method stub

	}

}
